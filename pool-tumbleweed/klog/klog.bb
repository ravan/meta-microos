SUMMARY = "Time tracking in a human-readable, plain-text file format"
DESCRIPTION = "klog is a plain-text file format and a command line tool for time tracking. \
 \
The idea behind klog is to store data in plain-text files in a simple and \
human-readable format. The notation is similar to how you would write down the \
information into a physical notebook using pen and paper. Manipulating your \
data is as easy as opening the file in a text editor and making changes to the \
copy. By using the klog command line tool you can search, evaluate and \
manipulate your data from the terminal."
LICENSE = "MIT"

PV = "7.1"

RPM_NAME = "klog-7.1-1.6.aarch64.rpm"
RPM_HASH = "fabe5e02c2a4fd27f9a790f0190e104e6b769e465d9ef451bbb1fdc0354d6564015e3426bee391c9b8d63a8644166b1bd39d16f561d1de7b7b389067c763e880"

RPROVIDES:${PN} += "klog"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
