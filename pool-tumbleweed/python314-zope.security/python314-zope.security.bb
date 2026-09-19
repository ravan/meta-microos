SUMMARY = "Zope Security Framework"
DESCRIPTION = "The Security framework provides a generic mechanism to implement security \
policies on Python objects."
LICENSE = "ZPL-2.1"

PV = "8.4"

RPM_NAME = "python314-zope.security-8.4-1.1.aarch64.rpm"
RPM_HASH = "698a30b1b7bd387f451333541800aaed3cf223153fede6fae73353569c47ba3b7753930c07c59d874ccb41181431f1cced0458ad0935f34a4c106a208b8e324b"

RPROVIDES:${PN} += "python3.14dist-zope.security \
python314-zope.security \
python3dist-zope.security"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-pytz \
python314-zope.component \
python314-zope.configuration \
python314-zope.i18nmessageid \
python314-zope.interface \
python314-zope.location \
python314-zope.proxy \
python314-zope.schema"

inherit rpm
