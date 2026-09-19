SUMMARY = "OpenStack Profiler Library"
DESCRIPTION = "OSProfiler provides a tiny but powerful library that is used by \
most (soon to be all) OpenStack projects and their python clients. It \
provides functionality to be able to generate 1 trace per request, that goes \
through all involved services. This trace can then be extracted and used \
to build a tree of calls which can be quite handy for a variety of \
reasons (for example in isolating cross-project performance issues)."
LICENSE = "Apache-2.0"

PV = "4.4.0"

RPM_NAME = "python313-osprofiler-4.4.0-1.1.noarch.rpm"
RPM_HASH = "e4994752c33ca56d209567ace79e7efbbadeb438a80b5edc9c7899bc3815144ea960d378842e45c9c3c27f47eb583e0b521db16bcb262942a7ef64bb9010f447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-osprofiler \
python3.13dist-osprofiler \
python313-osprofiler \
python3dist-osprofiler"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PrettyTable \
python313-WebOb \
python313-importlib-metadata \
python313-netaddr \
python313-oslo.concurrency \
python313-oslo.config \
python313-oslo.log \
python313-oslo.serialization \
python313-oslo.utils \
python313-requests"

inherit rpm
