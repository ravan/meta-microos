SUMMARY = "COLLADA plugin for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications. \
 \
This package contains the COLLADA plugin for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-with-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-plugin-collada-3.6.5-12.8.aarch64.rpm"
RPM_HASH = "d97d9a2084a7d25a974121c66be552e103c75c2720ee5fc9a91bc46f59eeb92641be279f67dc6d3ab4b38bb40511a2bd0126424b73b1ab7c9fdc4cf766e32a23"

RPROVIDES:${PN} += "OpenSceneGraph-plugin-collada \
OpenSceneGraph-plugins-/usr/lib64/osgPlugins-3.6.5/osgdb-dae.so \
OpenSceneGraphPlugin-ext-dae"

RDEPENDS:${PN} += "libOpenThreads.so.21 \
libc.so.6 \
libcollada-dom2.5-dp.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libosg.so.161 \
libosgAnimation.so.161 \
libosgDB.so.161 \
libosgSim.so.161 \
libosgUtil.so.161 \
libstdc++.so.6"

inherit rpm
