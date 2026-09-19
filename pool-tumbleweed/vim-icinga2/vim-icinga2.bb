SUMMARY = "Vim syntax highlighting for icinga2"
DESCRIPTION = "Provides Vim syntax highlighting for icinga2."
LICENSE = "GPL-3.0-or-later"

PV = "2.16.5"

RPM_NAME = "vim-icinga2-2.16.5-1.2.aarch64.rpm"
RPM_HASH = "7fd9451be1540f42743685f7152ca44497c6f8a4bc9d57b513f92796c5733d3afb5725b91a6880f0dfd7a702a26b16e91e09963efc20d91154903f056348dd34"

RPROVIDES:${PN} += "vim-icinga2"

RDEPENDS:${PN} += "vim"

inherit rpm
