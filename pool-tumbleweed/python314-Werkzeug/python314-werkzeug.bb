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

RPM_NAME = "python314-Werkzeug-3.1.8-1.2.noarch.rpm"
RPM_HASH = "460f9fd2140c94957e2036a8b102be18f26a24134c6c8779c5dff9fe2eba28365c8f5a31b7b671364aa8f9589b5aeeb8e4ae59778e969e6641d6f439b5ce66f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-werkzeug \
python314-Werkzeug \
python314-Werkzeug-doc \
python3dist-werkzeug"

RDEPENDS:${PN} += "python-abi \
python314-MarkupSafe"

inherit rpm
