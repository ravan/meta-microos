SUMMARY = "Database abstraction layer"
DESCRIPTION = "PEAR MDB2 is a merge of the PEAR DB and Metabase php database abstraction layers. \
 \
It provides a common API for all supported RDBMS. The main difference to most \
other DB abstraction packages is that MDB2 goes much further to ensure \
portability. MDB2 provides most of its many features optionally that \
can be used to construct portable SQL statements: \
* Object-Oriented API \
* A DSN (data source name) or array format for specifying database servers \
* Datatype abstraction and on demand datatype conversion \
* Various optional fetch modes to fix portability issues \
* Portable error codes \
* Sequential and non sequential row fetching as well as bulk fetching \
* Ability to make buffered and unbuffered queries \
* Ordered array and associative array for the fetched rows \
* Prepare/execute (bind) named and unnamed placeholder emulation \
* Sequence/autoincrement emulation \
* Replace emulation \
* Limited sub select emulation \
* Row limit emulation \
* Transactions/savepoint support \
* Large Object support \
* Index/Unique Key/Primary Key support \
* Pattern matching abstraction \
* Module framework to load advanced functionality on demand \
* Ability to read the information schema \
* RDBMS management methods (creating, dropping, altering) \
* Reverse engineering schemas from an existing database \
* SQL function call abstraction \
* Full integration into the PEAR Framework \
* PHPDoc API documentation"
LICENSE = "BSD-3-Clause"

PV = "2.5.0b5"

RPM_NAME = "php-pear-MDB2-2.5.0b5-1.19.noarch.rpm"
RPM_HASH = "5b4347d2599a5c909a4aae0120348542d3af1cd5ab71b15797e401ab79a9a0cecfcfc351bd93fc636a6d5e779a68f646977b172fc66283a637e95f8aec48bc58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pear-MDB2 \
php5-pear-MDB2 \
php7-pear-MDB2"

RDEPENDS:${PN} += "/usr/bin/sh \
php-pear"

inherit rpm
