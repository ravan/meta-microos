SUMMARY = "An incremental parsing system for programming tools"
DESCRIPTION = "Tree-sitter is a parser generator tool and an incremental parsing \
library. It can build a concrete syntax tree for a source file \
and efficiently update the syntax tree as the source file is \
edited. Tree-sitter aims to be: \
 \
 * General enough to parse any programming language \
 * Fast enough to parse on every keystroke in a text editor \
 * Robust enough to provide useful results even in the presence \
   of syntax errors \
 * Dependency-free so that the runtime library (which is written \
   in pure C) can be embedded in any application"
LICENSE = "GPL-2.0-only & MIT"

PV = "0.26.8"

RPM_NAME = "tree-sitter-0.26.8-5.2.aarch64.rpm"
RPM_HASH = "2d41664a8b71027a3cea873f60000b45fdacbd30ab3825b9a2870e3f75ef7c4506f2ca706d7d58d709634d3a47e23dac33083a11f3f3b25c6066075897432aec"

RPROVIDES:${PN} += "rpm-macro--treesitter-base-name \
rpm-macro--treesitter-definitions \
rpm-macro--treesitter-grammar-base-libname \
rpm-macro--treesitter-grammar-develdir \
rpm-macro--treesitter-grammardir \
rpm-macro--treesitter-macro-init \
rpm-macro--treesitter-python-shim-template \
rpm-macro-treesitter-build \
rpm-macro-treesitter-configure \
rpm-macro-treesitter-devel-files \
rpm-macro-treesitter-devel-install \
rpm-macro-treesitter-devel-package \
rpm-macro-treesitter-files \
rpm-macro-treesitter-grammars \
rpm-macro-treesitter-install \
rpm-macro-treesitter-python-build \
rpm-macro-treesitter-python-install \
rpm-macro-treesitter-set-flags \
rpm-macro-treesitter-target \
tree-sitter"

RDEPENDS:${PN} += "/usr/bin/python3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libtree-sitter0-26 \
nodejs"

inherit rpm
