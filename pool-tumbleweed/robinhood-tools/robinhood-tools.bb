SUMMARY = "Tools for accessing the statistics"
DESCRIPTION = "The commanline tools for extracting the information out of the \
robinhood database. Commands work like du or df and find. Be careful \
as robinhood_find does not always honor the file permissions."
LICENSE = "CECILL-C"

PV = "3.2.0"

RPM_NAME = "robinhood-tools-3.2.0-2.3.aarch64.rpm"
RPM_HASH = "8f0d9beb237dcfeb404121cdd77bc6ca38a8b6a515cafa4ee50b53eff27eea3162e949ac5ad81d8e50a8cc566add00730100203957de7fdc04c846c63cc3241f"

RPROVIDES:${PN} += "robinhood-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libjemalloc.so.2 \
libmariadb.so.3"

inherit rpm
