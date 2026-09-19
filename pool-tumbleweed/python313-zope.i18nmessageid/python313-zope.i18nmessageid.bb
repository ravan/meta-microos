SUMMARY = "Zope Location"
DESCRIPTION = "In Zope3, i18nmessageid are special objects that has a structural i18nmessageid."
LICENSE = "ZPL-2.1"

PV = "8.2"

RPM_NAME = "python313-zope.i18nmessageid-8.2-1.4.aarch64.rpm"
RPM_HASH = "4f74c435a42a90cf5eeb372bfa6128840ec20b2efc34de1928f6f5f53101cfa65322d5fb7f4f347bcd275b45458fd05098274810594ae00890903cba39d144ec"

RPROVIDES:${PN} += "python3-zope.i18nmessageid \
python3.13dist-zope.i18nmessageid \
python313-zope.i18nmessageid \
python3dist-zope.i18nmessageid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
