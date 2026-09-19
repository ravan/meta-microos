SUMMARY = "OpenStack Profiler Library"
DESCRIPTION = "OSProfiler provides a tiny but powerful library that is used by \
most (soon to be all) OpenStack projects and their python clients. It \
provides functionality to be able to generate 1 trace per request, that goes \
through all involved services. This trace can then be extracted and used \
to build a tree of calls which can be quite handy for a variety of \
reasons (for example in isolating cross-project performance issues)."
LICENSE = "Apache-2.0"

PV = "4.4.0"

RPM_NAME = "python314-osprofiler-4.4.0-1.1.noarch.rpm"
RPM_HASH = "5348a3f762cb9f8010652b457287e4c0426b21768d6e9d50dce31161902ce0fb8b3495301a9d1f48518483a02dfe111abf12d3b11bba5535575510f49ce56f21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-osprofiler \
python314-osprofiler \
python3dist-osprofiler"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PrettyTable \
python314-WebOb \
python314-importlib-metadata \
python314-netaddr \
python314-oslo.concurrency \
python314-oslo.config \
python314-oslo.log \
python314-oslo.serialization \
python314-oslo.utils \
python314-requests"

inherit rpm
