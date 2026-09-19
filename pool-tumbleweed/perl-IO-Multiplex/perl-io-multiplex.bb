SUMMARY = "Manage IO on many file handles"
DESCRIPTION = "It is object oriented in design, and will notify you of significant events \
by calling methods on an object that you supply. If you are not using \
objects, you can simply supply '__PACKAGE__' instead of an object \
reference. \
 \
You may have one callback object registered for each file handle, or one \
global one. Possibly both -- the per-file handle callback object will be \
used instead of the global one. \
 \
Each file handle may also have a timer associated with it. A callback \
function is called when the timer expires."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.16"

RPM_NAME = "perl-IO-Multiplex-1.16-1.42.noarch.rpm"
RPM_HASH = "324e037b7a8906745b116b818eb222535699413a8a2ff217b1df666a87e63d84fc844c04bdc4d7ac692d47f9d9627cb7769814f7d0fa04179df83e327288ec56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Multiplex \
perl-IO--Multiplex--Handle \
perl-IO-Multiplex"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
