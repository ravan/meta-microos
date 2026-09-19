SUMMARY = "SQLite backend for Minion job queue"
DESCRIPTION = "Minion::Backend::SQLite is a backend for Minion based on Mojo::SQLite. All \
necessary tables will be created automatically with a set of migrations \
named 'minion'. If no connection string or ':temp:' is provided, the \
database will be created in a temporary directory."
LICENSE = "Artistic-2.0"

PV = "6.0.0"

RPM_NAME = "perl-Minion-Backend-SQLite-6.0.0-1.3.noarch.rpm"
RPM_HASH = "947a6d0470c99ec9bc9f2e93fffa79396c6372f67d2912aa33adfa5c75ff0ab9ba6bcc2b2eccb0b2f4f3771818c65bbab5b6a61e6266666ad392a64ae88401e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Minion--Backend--SQLite \
perl-Minion-Backend-SQLite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DBD--SQLite \
perl-Minion \
perl-Mojo--SQLite \
perl-Mojolicious"

inherit rpm
