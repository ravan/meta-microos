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

RPM_NAME = "python313-eventlet-0.41.2-1.1.noarch.rpm"
RPM_HASH = "b72b2e5e5ece6b3f04ae68fc7f3975a2752f183a76286ee38f0812b6fc3acca8a39261f84b90a51ef6c63b4c7bb100e1f45808267b2dac59538fd7d3e6e01293"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-eventlet \
python3.13dist-eventlet \
python313-eventlet \
python3dist-eventlet"

RDEPENDS:${PN} += "libnss-usrfiles2 \
netcfg \
python-abi \
python313-dnspython \
python313-greenlet"

inherit rpm
