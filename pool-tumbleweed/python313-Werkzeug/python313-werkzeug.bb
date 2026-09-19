SUMMARY = "The Swiss Army knife of Python web development"
DESCRIPTION = "Werkzeug started as simple collection of various utilities for WSGI \
applications and has become one of the most advanced WSGI utility \
modules.  It includes a powerful debugger, full featured request and \
response objects, HTTP utilities to handle entity tags, cache control \
headers, HTTP dates, cookie handling, file uploads, a powerful URL \
routing system and a bunch of community contributed addon modules. \
 \
Werkzeug is unicode aware and doesn't enforce a specific template \
engine, database adapter or anything else.  It doesn't even enforce \
a specific way of handling requests and leaves all that up to the \
developer. It's most useful for end user applications which should work \
on as many server environments as possible (such as blogs, wikis, \
bulletin boards, etc.)."
LICENSE = "BSD-3-Clause"

PV = "3.1.8"

RPM_NAME = "python313-Werkzeug-3.1.8-1.2.noarch.rpm"
RPM_HASH = "004ccee17359bf562d1cce5084f44845ff651b17561c706963fa6dbe1f01a46e78c90b874758edc430f6a13648522bb45253fa652dbab733396b25aa77b8e84b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Werkzeug \
python3-Werkzeug-doc \
python3.13dist-werkzeug \
python313-Werkzeug \
python313-Werkzeug-doc \
python3dist-werkzeug"

RDEPENDS:${PN} += "python-abi \
python313-MarkupSafe"

inherit rpm
