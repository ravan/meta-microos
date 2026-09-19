SUMMARY = "KDE PIM Libraries for Akonadi Contacts"
DESCRIPTION = "This package provides a library used for handling personal contacts, \
as part of the KDE Personal Information Management (PIM) software."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadi-contacts-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "9b054de1f27efdec31a3d4bcedec1b16493f922547f35e29d1eed5f6f305cdc3ee93746c125447e5c76faa959dffd93e5bd008bb47289826f79f2d230f6083e1"

RPROVIDES:${PN} += "akonadi-contact \
akonadi-contacts"

RDEPENDS:${PN} += ""

inherit rpm
