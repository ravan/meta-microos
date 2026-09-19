SUMMARY = "Parses simple configuration files"
DESCRIPTION = "ConfigFile parses simple configuration files and stores its values in an \
anonymous hash reference. The syntax of the configuration file is quite \
simple: \
 \
1.  This is a comment VALUE_ONE = foo VALUE_TWO = $VALUE_ONE/bar \
VALUE_THREE = The value contains a \\# (hash). # This is a comment. \
COMPOSED_VALUE[one] = The first component of a clustered value \
COMPOSED_VALUE[two] = The second component of a clustered value \
 \
 \
 \
Authors: \
-------- \
    Sebastien J. Gross <seb@sjgross.org>"
LICENSE = "GPL-2.0+"

PV = "1.1.1"

RPM_NAME = "perl-libconfigfile-1.1.1-165.8.aarch64.rpm"
RPM_HASH = "329984f419da1eb2541ae6d89ba6cc636ce6aefb59086957d6a3fa0465897c74b3eded85fdb2ebe52093b92d0371fdc2cba2b93600de5aebe8245f534707f830"

RPROVIDES:${PN} += "perl-ConfigFile \
perl-libconfigfile"

RDEPENDS:${PN} += ""

inherit rpm
