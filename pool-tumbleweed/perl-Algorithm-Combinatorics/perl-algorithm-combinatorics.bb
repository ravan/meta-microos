SUMMARY = "Efficient generation of combinatorial sequences"
DESCRIPTION = "Algorithm::Combinatorics is an efficient generator of combinatorial \
sequences. Algorithms are selected from the literature (work in progress, \
see REFERENCES). Iterators do not use recursion, nor stacks, and are \
written in C. \
 \
Tuples are generated in lexicographic order, except in 'subsets()'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.270.0"

RPM_NAME = "perl-Algorithm-Combinatorics-0.270.0-1.10.aarch64.rpm"
RPM_HASH = "15cbe06bf4f0441f67182650e880e5e6744d855c0742b109a27e4263039be328c74ea4a3232cc002cc5a77c06d84155f18fbc353ee9d93b19e9e304432f3ee25"

RPROVIDES:${PN} += "perl-Algorithm--Combinatorics \
perl-Algorithm--Combinatorics--Iterator \
perl-Algorithm--Combinatorics--JustCoderef \
perl-Algorithm-Combinatorics"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
