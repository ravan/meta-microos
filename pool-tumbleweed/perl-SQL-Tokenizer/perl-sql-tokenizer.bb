SUMMARY = "A simple SQL tokenizer"
DESCRIPTION = "SQL::Tokenizer is a simple tokenizer for SQL queries. It does not claim to \
be a parser or query verifier. It just creates sane tokens from a valid SQL \
query. \
 \
It supports SQL with comments like: \
 \
 -- This query is used to insert a message into \
 -- logs table \
 INSERT INTO log (application, message) VALUES (?, ?) \
 \
Also supports '''', '''' and '\\'' escaping methods, so tokenizing queries \
like the one below should not be a problem: \
 \
 INSERT INTO log (application, message) \
 VALUES ('myapp', 'Hey, this is a ''single quoted string''!')"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.24"

RPM_NAME = "perl-SQL-Tokenizer-0.24-1.42.noarch.rpm"
RPM_HASH = "a231f1f7ed94281c4339e7b02d6396af8f227727884501cb86c4fd3d7c431d67c36cee17b07ace5ca7789ebb583a6f096a0e36b7fc89e3baf13ce7c2dcc8d017"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SQL--Tokenizer \
perl-SQL-Tokenizer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
