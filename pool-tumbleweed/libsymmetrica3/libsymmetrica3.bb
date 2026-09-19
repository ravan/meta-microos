SUMMARY = "C library for group theory"
DESCRIPTION = "Symmetrica is a C library with routines for the following applications, \
among others: \
 \
* ordinary representation theory of the symmetric group and related groups \
* ordinary representation theory of the classical groups \
* modular representation theory of the symmetric group \
* projective representation theory of the symmetric group \
* combinatorics of tableaux \
* symmetric functions and polynomials \
* commutative and non commutative Schubert polynomials \
* operations of finite groups \
* ordinary representation theory of Hecke algebras of type A_n"
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "libsymmetrica3-3.1.0-1.6.aarch64.rpm"
RPM_HASH = "c31860bb933583cfbfa56fc45dbda4853c1396072ed73d8b51b711a34839e1ef50822f7c3d6f50649a76924347a22203cb8164c067004b3dcfb703ddd1426898"

RPROVIDES:${PN} += "libsymmetrica.so.3 \
libsymmetrica3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
