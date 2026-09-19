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

RPM_NAME = "python313-netifaces-0.11.0-3.7.aarch64.rpm"
RPM_HASH = "f12abf7925ac37e98b645efc56441861518ee88d29a800f7f1c6850ac49a1c1ba70308551292a77cf3527813759020a8e28aa2526174031f4004ba33042a17a8"

RPROVIDES:${PN} += "python3-netifaces \
python3.13dist-netifaces \
python313-netifaces \
python3dist-netifaces"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
