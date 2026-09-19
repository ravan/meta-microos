SUMMARY = "API for weak references to be created in Perl"
DESCRIPTION = "A patch to Perl 5.005_55 by the author implements a core API for weak \
references. This module is a Perl-level interface to that API, allowing \
weak references to be created in Perl. \
 \
A weak reference is just like an ordinary Perl reference except that it \
isn't included in the reference count of the thing referred to. This \
means that once all references to a particular piece of data are weak, \
the piece of data is freed and all the weak references are set to \
undef. This is particularly useful for implementing circular data \
structures without memory leaks or caches of objects. \
 \
 \
 \
Authors: \
-------- \
    Tuomas J. Lukka      <lukka@iki.fi>"
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "0.01"

RPM_NAME = "perl-WeakRef-0.01-149.55.aarch64.rpm"
RPM_HASH = "bdf52868081a10b406e6c064c84da184f6bf64ac6338215f3c9514a131f9c36cd345360ce8c76266246061810947cf9cb7200a76aec2a32bd94b35532ffcba60"

RPROVIDES:${PN} += "perl-WeakRef \
perl-Weakref"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
