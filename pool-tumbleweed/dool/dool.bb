SUMMARY = "Versatile vmstat, iostat and ifstat replacement"
DESCRIPTION = "Dool is a command line tool to monitor many aspects of your Linux system: CPU, Memory, Network, Load Average, etc. It also includes a robust plug-in architecture to allow monitoring other system metrics. \
 \
Dool is a Python3 compatible fork of Dstat."
LICENSE = "GPL-2.0-only"

PV = "1.3.8"

RPM_NAME = "dool-1.3.8-1.3.noarch.rpm"
RPM_HASH = "9e8bc0e395d16c74046ca759630140390e85a55d8acfe112caed05ab4be12fda07bfd2834b422a38326c412ba2433f4bdbeb2df42dfa7fcfb534e1e3ef923f60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dool \
dstat"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-curses \
python3-six"

inherit rpm
