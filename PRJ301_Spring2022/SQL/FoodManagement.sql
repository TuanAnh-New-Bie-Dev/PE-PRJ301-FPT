create table Users(
userID varchar(50) not null primary key,
fullName nvarchar(500) not null,
roleID char(2) not null,
password varchar(50) not null
)

create table Foods(
id char(5) not null primary key check (id like 'F-[0-9][0-9][0-9]' ),
name nvarchar(50) not null,
description nvarchar(500) not null,
price decimal(18, 2),
cookingTime int,
status bit
)

insert into Users values('tuananh57', N'Hoàng Tuấn Anh', 'MA', 'anhdn123')
insert into Users values('tuankhoa57', N'Nguyễn Hoàng Tuấn Khoa', 'UA', 'anhdn123')

insert into Foods values('F-001', N'Ốc xào sả ớt', N'Ốc xào có màu vàng hấp dẫn, vị ngọt đậm, béo bùi hòa quyện với vị cay thơm nồng của sả ớt, ăn vào nghe dòn dòn, dai dai, sừn sựt rất thú vị.', 17.2, 10, 1)
insert into Foods values('F-002', N'Mực nhồi thịt sốt cà chua', N'Mực nhồi thịt chiên sốt cà chua sau khi hoàn tất sẽ có mùi thơm hấp dẫn. Mực thì mềm, ngọt nước sốt cà chua thì đậm đà, thơm ngon kết hợp cùng vị ngon mềm của thịt băm. Đảm bảo đây sẽ là một món ăn ngon đầy đủ dinh dưỡng, đổi vị cho bữa cơm gia đình bạn đó!', 20.99, 10, 1)
insert into Foods values('F-003', N'Thịt lợn kho tiêu', N'Thịt ba chỉ kho tiêu sau khi hoàn thành sẽ có màu sắc óng ánh, với mùi thơm đặc biệt của tiêu. Khi ăn vào bạn sẽ cảm thấy vị béo ngậy của mỡ thịt cùng với vị hơi cay cay của nước thịt kho. Ăn với cơm trắng là bao hết ý phải không nào?', 20, 11, 1)
insert into Foods values('F-004', N'Sườn kho dừa', N'Món sườn non kho nước dừa thường được ăn kèm với cơm rất ngon miệng. Mùi thơm của nước dừa, vị ngọt từ sườn mang lại trải nghiệm ẩm thực tuyệt vời cho bạn và gia đình.', 21.99, 12, 1)
insert into Foods values('F-005', N'Bắp bò muối', N'Bắp bò muối phải đạt các yêu cầu sau: Có màu nâu đẹp, không quá dai, vị chua mặn ngọt vừa miệng. Mùi thơm hài hoà giữa các loại nguyên liệu kết hợp với nhau. Khi ăn cắt mỏng bắp bò như cắt thịt bò luộc thành miếng vừa ăn. Món bắp bò bạn có thể trữ để ăn dần trong tủ lạnh sẽ giữ được khoảng hơn 1 tuần.', 22.99, 13, 1)
insert into Foods values('F-006', N'Canh rau dền', N'Dền là loài cây thân thảo, cây trưởng thành cao tầm 20-30 cm, rễ mọc nông, ưa những vùng đất tơi xốp. Thân cây nhỏ, mềm, có màu xanh nhạt, đường kính chắc tầm bằng cái đầu đũa ăn cơm. Lá cây mọc từ gốc cho tới tận ngọn, một cây thường có nhiều lá.', 23.99, 14, 1)

select * from Users where  userID = 'tuananh57' and password = 'anhdn123'
select * from Users where userID = 'tuananh57'
select * from Foods where status = 1 and name like N'%m%'

update Foods set status = 1 where id = 'F-005';

delete from Users
delete from Foods