SUMMARY = "Metapackage to pull in all of python-nautilus' packages"
DESCRIPTION = "This package contains files required to build wrappers for python-nautilus."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "python313-nautilus-devel-4.1.0-1.7.aarch64.rpm"
RPM_HASH = "b613c64e0e99b3951da0c37c884a55a605cfb04a607e192f2a8e1ba422940935abcd1cf132b0bd6f66839ff4e7d2d8e51ce3e335600c15e7ec73186f31fd856e"

RPROVIDES:${PN} += "python3-nautilus-devel \
python313-nautilus-devel"

RDEPENDS:${PN} += "python313-devel \
python313-nautilus \
python313-nautilus-common-devel"

inherit rpm
