SUMMARY = "Write Perl subs and classes in Python"
DESCRIPTION = "The 'Inline::Python' module allows you to put Python source code directly \
'inline' in a Perl script or module. It sets up an in-process Python \
interpreter, runs your code, and then examines Python's symbol table for \
things to bind to Perl. The process of interrogating the Python interpreter \
for globals only occurs the first time you run your Python code. The \
namespace is cached, and subsequent calls use the cached version. \
 \
This document describes 'Inline::Python', the Perl package which gives you \
access to a Python interpreter. For lack of a better place to keep it, it \
also gives you instructions on how to use 'perlmodule', the Python package \
which gives you access to the Perl interpreter."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.580.0"

RPM_NAME = "perl-Inline-Python-0.580.0-1.8.aarch64.rpm"
RPM_HASH = "b10b155370ee3654ac97f925d9b4d4e3f2d1c8ce0ba5b6f868576bfc6578104e255739b3961d2aa2a73ff90bb10215786bb1e73b61c575d83743c4093704049a"

RPROVIDES:${PN} += "perl-Inline--Python \
perl-Inline--Python--Boolean \
perl-Inline--Python--Function \
perl-Inline--Python--Object \
perl-Inline--Python--Object--Data \
perl-Inline-Python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.13.so.1.0 \
perl--MODULE-COMPAT-5.44.0 \
perl-Digest--MD5 \
perl-Inline"

inherit rpm
