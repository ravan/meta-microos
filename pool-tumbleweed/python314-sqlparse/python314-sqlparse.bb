SUMMARY = "Non-validating SQL parser"
DESCRIPTION = "sqlparse is a non-validating SQL parser module.  It provides support for \
parsing, splitting and formatting SQL statements."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python314-sqlparse-0.6.0-1.1.noarch.rpm"
RPM_HASH = "8d5f04e2aeb98f2ac173d89398bc0a9f834e5095066a0c09c496610bb27c14a4b6a13b03edb3621b8835421ef96c01783dcbf2dca519c284a969ace67c6ec1cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sqlparse \
python314-sqlparse \
python3dist-sqlparse"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
