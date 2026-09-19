SUMMARY = "Portable network interface information"
DESCRIPTION = "netifaces provides a (hopefully portable-ish) way for Python programmers to \
get access to a list of the network interfaces on the local machine, and to \
obtain the addresses of those network interfaces. \
 \
The package has been tested on Mac OS X, Windows XP, Windows Vista, Linux and \
Solaris. On Windows, it is currently not able to retrieve IPv6 addresses, \
owing to shortcomings of the Windows API. \
 \
It should work on other UNIX-like systems provided they implement either \
getifaddrs() or support the SIOCGIFxxx socket options, although the data \
provided by the socket options is normally less complete."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python314-netifaces-0.11.0-3.7.aarch64.rpm"
RPM_HASH = "f4ded8acf24b5670bfc4a00a2b81cb68dc0e6aa4a9006c3d53f07690df836229ef3c453c072c354470857d20b10ed0e8cacb412e8e14a5868ffd397291764295"

RPROVIDES:${PN} += "python3.14dist-netifaces \
python314-netifaces \
python3dist-netifaces"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
