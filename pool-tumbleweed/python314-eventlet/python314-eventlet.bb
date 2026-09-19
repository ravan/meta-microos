SUMMARY = "Concurrent networking library for Python"
DESCRIPTION = "Eventlet is a concurrent networking library for Python that allows \
changing how code is run. \
 \
It uses epoll or libevent for scalable non-blocking I/O. Coroutines \
ensure that the developer uses a blocking style of programming that is similar \
to threading, but provide the benefits of non-blocking I/O. The event dispatch \
is implicit, which means Eventlet can be used from the Python \
interpreter, or as part of a larger application."
LICENSE = "MIT"

PV = "0.41.2"

RPM_NAME = "python314-eventlet-0.41.2-1.1.noarch.rpm"
RPM_HASH = "03740cc4e2956240aac00bf4c2fed37c61833b9bcf39a1bf7327e36ec90ffe7921fae06bf8f96b18fd11f896e7259cdb34ffeef030443596935f2946ded90d1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-eventlet \
python314-eventlet \
python3dist-eventlet"

RDEPENDS:${PN} += "libnss-usrfiles2 \
netcfg \
python-abi \
python314-dnspython \
python314-greenlet"

inherit rpm
