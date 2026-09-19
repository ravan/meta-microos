SUMMARY = "Development files for the libdat and libdapl libraries"
DESCRIPTION = "Library links and header files for the libdat and libdapl libraries."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "dapl-devel-2.1.10-9.6.aarch64.rpm"
RPM_HASH = "795efb36039f8a1132917f7e03dd85596591382ff0b761d9d359a75da0754a59e848d2c860135cda6b4ba24b52a5b8713143639cf1081e928a06f7fa01fa4e3e"

RPROVIDES:${PN} += "dapl-devel"

RDEPENDS:${PN} += "dapl \
glibc-devel"

inherit rpm
