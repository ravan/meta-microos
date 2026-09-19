SUMMARY = "Mail Merge Functionality for LibreOffice"
DESCRIPTION = "This module allows you to create form letters or send E-mail messages \
to many recipients using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-mailmerge-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "72a5cedba8e54ed7cfdf5d59b612743e4e3cb3f534f2121892bf11c1be192aa661b2aaf695e128e7d8690d275a6584b1505f5b9f117b68f22429b02a6ec9474c"

RPROVIDES:${PN} += "libreoffice-mailmerge"

RDEPENDS:${PN} += "libreoffice-pyuno"

inherit rpm
