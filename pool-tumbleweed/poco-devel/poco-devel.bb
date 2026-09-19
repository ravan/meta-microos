SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "poco-devel-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "a1f70ade6c7a7a13c3a7db897ca20110e2f0296b6bfeabd8268483e4f8bf074b806268cb5a2b4db166f74b46415c900153957811bfaa72006bdb2dceeabadf81"

RPROVIDES:${PN} += "cmake-Poco \
cmake-PocoActiveRecord \
cmake-PocoCppParser \
cmake-PocoCrypto \
cmake-PocoData \
cmake-PocoDataMySQL \
cmake-PocoDataODBC \
cmake-PocoDataPostgreSQL \
cmake-PocoDataSQLite \
cmake-PocoEncodings \
cmake-PocoFoundation \
cmake-PocoJSON \
cmake-PocoJWT \
cmake-PocoMongoDB \
cmake-PocoNet \
cmake-PocoNetSSL \
cmake-PocoPDF \
cmake-PocoPrometheus \
cmake-PocoRedis \
cmake-PocoUtil \
cmake-PocoXML \
cmake-PocoZip \
libpoco-devel \
poco-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libPocoCppParser123 \
libPocoCrypto123 \
libPocoData123 \
libPocoDataMySQL123 \
libPocoDataODBC123 \
libPocoDataPostgreSQL123 \
libPocoDataSQLite123 \
libPocoEncodings123 \
libPocoFoundation.so.123 \
libPocoFoundation123 \
libPocoJSON123 \
libPocoJWT123 \
libPocoMongoDB123 \
libPocoNet123 \
libPocoNetSSL123 \
libPocoPDF123 \
libPocoPrometheus123 \
libPocoRedis123 \
libPocoUtil.so.123 \
libPocoUtil123 \
libPocoXML.so.123 \
libPocoXML123 \
libPocoZip123 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
poco-cpspc"

inherit rpm
