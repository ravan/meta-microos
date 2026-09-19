SUMMARY = "Utilities for core application functionality and accessing the OS"
DESCRIPTION = "KCoreAddons provides classes built on top of QtCore to perform various tasks \
such as manipulating mime types, autosaving files, creating backup files, \
generating random sequences, performing text manipulations such as macro \
replacement, accessing user information and many more."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kcoreaddons-5.116.0-1.9.aarch64.rpm"
RPM_HASH = "3cab7037b08cbe317735323fdaf4bfaf536abbe9b1cd027e76195f768d1549cb8c8325dfab556486a02a35cd66178be34598a55ac83356b6bce996e4fcb169e7"

RPROVIDES:${PN} += "kcoreaddons"

RDEPENDS:${PN} += "shared-mime-info"

inherit rpm
