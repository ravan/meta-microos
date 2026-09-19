SUMMARY = "Open source version of scalable, non-blocking web server that power FriendFeed"
DESCRIPTION = "Tornado is an open source version of the scalable, non-blocking web server and \
tools that power FriendFeed. The FriendFeed application is written using a web \
framework that looks a bit like web.py or Google's webapp, but with additional \
tools and optimizations to take advantage of the underlying non-blocking \
infrastructure. \
 \
The framework is distinct from most mainstream web server frameworks (and \
certainly most Python frameworks) because it is non-blocking and reasonably \
fast. Because it is non-blocking and uses epoll, it can handle thousands of \
simultaneous standing connections, which means it is ideal for real-time web \
services. We built the web server specifically to handle FriendFeed's real-time \
features — every active user of FriendFeed maintains an open connection to the \
FriendFeed servers. (For more information on scaling servers to support \
thousands of clients, see The C10K problem.)"
LICENSE = "Apache-2.0"

PV = "6.5.8"

RPM_NAME = "python313-tornado6-6.5.8-1.1.aarch64.rpm"
RPM_HASH = "233b74670169628a561a679d251ab120fc7d2630d5207a19cc6c3c127a26101ca529edafcbff124637a0e8065f9c8a688048faffcd9092dabb1191dd337153b3"

RPROVIDES:${PN} += "python3-tornado \
python3-tornado-impl \
python3-tornado6 \
python3-toro \
python3.13dist-tornado \
python313-tornado \
python313-tornado-impl \
python313-tornado6 \
python313-toro \
python3dist-tornado"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313"

inherit rpm
