SUMMARY = "Tools for computing automorphism groups of graphs"
DESCRIPTION = "nauty and Traces are programs for computing automorphism groups of \
graphs and digraphs (*Traces does not accept digraphs at this time). \
They can also produce a canonical label. They are written in a \
portable subset of C, and run on a considerable number of different \
systems. \
 \
There is a small suite of programs called gtools included in the \
package. For example, geng can generate non-isomorphic graphs very \
quickly. There are also generators for bipartite graphs, digraphs, \
and multigraphs."
LICENSE = "Apache-2.0"

PV = "2.9.3"

RPM_NAME = "nauty-2.9.3-1.5.aarch64.rpm"
RPM_HASH = "c73a241a9db79b60c1cd8f6ff161740f5ad0d522d00d72cbcdd69847c4c903a53024adbbe6d342ee249e56c63e1957ac4008ab0c8a5a95491afb69d84aa9e34d"

RPROVIDES:${PN} += "nauty"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libnauty-2.9.3.so \
libnautyA1-2.9.3.so \
libnautyL1-2.9.3.so \
libnautyW1-2.9.3.so"

inherit rpm
