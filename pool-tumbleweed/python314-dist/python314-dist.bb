SUMMARY = "Compute distance between two coordinates on the map"
DESCRIPTION = "As more and more apps are using maps, the more demand for geolocation capabilities increase. \
Geolocation is about the reporting of your location to other users, \
as well as associating real-world locations (such as landmarks) to your location. \
This repo helps to accurately calculate the distance between two locations \
and presents a time efficient practical solution, \
that is almost 3 times faster than similar fast pure python implementation."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python314-dist-1.0.3-5.7.aarch64.rpm"
RPM_HASH = "9e3828442c3bbc65ced4186f465314915a9f68cf953e3bfdf8f1007d2e0e249443d1d23d2f3499c8040a65ed10a34ceefb148c36690978452587bd1db81cc4c1"

RPROVIDES:${PN} += "python3.14dist-dist \
python314-dist \
python3dist-dist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
