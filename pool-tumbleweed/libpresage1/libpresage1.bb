SUMMARY = "Intelligent predictive text entry platform (shared library)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
A predictive text entry system attempts to improve the ease and speed of textual input by predicting words. Word prediction consists in computing which word tokens or word completions are most likely to be entered next. The system analyses the text already entered and combines the information thus extracted with other information sources to calculate the set of most probable tokens. \
 \
Presage exploits redundant information embedded in natural languages to generate word predictions. The modular architecture allows its language model to be extended and customized to utilize statistical, syntactic, and semantic information sources. \
 \
This package contains the shared library."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "libpresage1-0.9.1-18.6.aarch64.rpm"
RPM_HASH = "f6ad7d281db8f22aafcb657cf9c2307f2ce5de329e8f3f53edccb38b84ce4d5fddc304024df4468b86e27b1fc1450c9c58ff38cd1d5a48c75e2b572520fdb2a3"

RPROVIDES:${PN} += "libpresage.so.1 \
libpresage1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
presage-data"

inherit rpm
