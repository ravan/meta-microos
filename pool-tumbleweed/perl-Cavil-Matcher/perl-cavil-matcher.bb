SUMMARY = "Next-generation license pattern matcher for Cavil"
DESCRIPTION = "'Cavil::Matcher' turns source files into license and keyword matches for at \
https://github.com/openSUSE/cavil. It keeps the proven token-hash \
prefix-tree algorithm of its predecessor, Spooky::Patterns::XS, but stores \
the compiled patterns as immutable, memory-mapped *segments* described by a \
small *manifest*, so that adding or removing a pattern never rebuilds the \
whole cache and index workers share one physical copy of the data per host. \
 \
The tokenizer and hashing are a frozen C++ core, bit-for-bit compatible \
with the previous engine; the segment lifecycle is pure Perl (see \
Cavil::Matcher::Index and Cavil::Matcher::Manifest). For the design and \
rationale see _docs/Architecture.md_."
LICENSE = "GPL-1.0-or-later"

PV = "1.50.0"

RPM_NAME = "perl-Cavil-Matcher-1.50.0-1.1.aarch64.rpm"
RPM_HASH = "9b808b7526e8b57c1993140a8925d3122381d2f78316679fedb5595c6444f39b73ee088478d81a26b791b1d34d2fd14214b494dba124999002725eb6d8c404bb"

RPROVIDES:${PN} += "perl-Cavil--Matcher \
perl-Cavil--Matcher--Hash \
perl-Cavil--Matcher--Index \
perl-Cavil--Matcher--Manifest \
perl-Cavil-Matcher"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Cpanel--JSON--XS"

inherit rpm
