SUMMARY = "Compute distance between two coordinates on the map"
DESCRIPTION = "As more and more apps are using maps, the more demand for geolocation capabilities increase. \
Geolocation is about the reporting of your location to other users, \
as well as associating real-world locations (such as landmarks) to your location. \
This repo helps to accurately calculate the distance between two locations \
and presents a time efficient practical solution, \
that is almost 3 times faster than similar fast pure python implementation."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python313-dist-1.0.3-5.7.aarch64.rpm"
RPM_HASH = "76c09a3c51b18142dfc0fc8d43723d1a978d4daf9d9dca10327cb4687c41cc01332355583f6dba68dcf7e801676c922cfbbb755ecad7d98c39b399dc5825c0fc"

RPROVIDES:${PN} += "python3-dist \
python3.13dist-dist \
python313-dist \
python3dist-dist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
