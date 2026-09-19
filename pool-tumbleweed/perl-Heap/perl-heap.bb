SUMMARY = "Perl extensions for keeping data partially sorted"
DESCRIPTION = "The Heap collection of modules provide routines that manage a heap of \
elements. A heap is a partially sorted structure that is always able to \
easily extract the smallest of the elements in the structure (or the \
largest if a reversed compare routine is provided). \
 \
If the collection of elements is changing dynamically, the heap has less \
overhead than keeping the collection fully sorted. \
 \
The elements must be objects as described in 'Heap::Elem' and all elements \
inserted into one heap must be mutually compatible - either the same class \
exactly or else classes that differ only in ways unrelated to the \
*Heap::Elem* interface."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.800.0"

RPM_NAME = "perl-Heap-0.800.0-1.8.noarch.rpm"
RPM_HASH = "e603df748429d5044a38ee1313ac973656504c6042c44b7694e59827912c62565e7e1eda75bec12395c2f14d1fe7b4ac286dcbdf9f70be0259a75919596855a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Heap \
perl-Heap--Binary \
perl-Heap--Binomial \
perl-Heap--Elem \
perl-Heap--Elem--Num \
perl-Heap--Elem--NumRev \
perl-Heap--Elem--Ref \
perl-Heap--Elem--RefRev \
perl-Heap--Elem--Str \
perl-Heap--Elem--StrRev \
perl-Heap--Fibonacci"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
