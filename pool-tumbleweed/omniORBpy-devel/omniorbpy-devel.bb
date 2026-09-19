SUMMARY = "Header files for omniORBpy"
DESCRIPTION = "omniORBpy-devel contains the omniORBpy development files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.2"

RPM_NAME = "omniORBpy-devel-4.3.2-1.10.aarch64.rpm"
RPM_HASH = "2950f3c1c56a904e560b91f94e112d7be8a3ac22a5bd7309b7827ba90ee5a15c8a5410cf9fd8b81b8b075abf63a50aef30afb72ba991dcb7bb7bb0bc5e652dc9"

RPROVIDES:${PN} += "omniORBpy-devel"

RDEPENDS:${PN} += "omniORBpy"

inherit rpm
