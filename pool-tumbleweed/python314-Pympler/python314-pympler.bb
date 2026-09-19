SUMMARY = "A tool to analyze the memory behavior of Python objects"
DESCRIPTION = "Pympler is a development tool to measure, monitor and analyze the \
memory behavior of Python objects in a running Python application. \
 \
By pympling a Python application, detailed insight in the size and \
the lifetime of Python objects can be obtained.  Undesirable or \
unexpected runtime behavior like memory bloat and other 'pymples' \
can easily be identified."
LICENSE = "Apache-2.0"

PV = "1.1"

RPM_NAME = "python314-Pympler-1.1-6.4.noarch.rpm"
RPM_HASH = "26b3dba1dcada29d431a13a9abcaa22d86b10e0762ecfc1814ca232b2fadc24eeb6741b906252bfa6ba5fead83cedea6c9b501ba6032c3faaeae4533c0e77f7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pympler \
python314-Pympler \
python3dist-pympler"

RDEPENDS:${PN} += "python-abi \
python314-tk"

inherit rpm
