SUMMARY = "Zope Security Framework"
DESCRIPTION = "The Security framework provides a generic mechanism to implement security \
policies on Python objects."
LICENSE = "ZPL-2.1"

PV = "8.4"

RPM_NAME = "python313-zope.security-8.4-1.1.aarch64.rpm"
RPM_HASH = "481e810070f201bfff3afc753d2d220b69540c352412ba4f1ba44596ff7f9424eedb8825207291367e6891c73a60205b6ce516ed7bf5bf9cdf862349e9326ad0"

RPROVIDES:${PN} += "python3-zope.security \
python3.13dist-zope.security \
python313-zope.security \
python3dist-zope.security"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-pytz \
python313-zope.component \
python313-zope.configuration \
python313-zope.i18nmessageid \
python313-zope.interface \
python313-zope.location \
python313-zope.proxy \
python313-zope.schema"

inherit rpm
