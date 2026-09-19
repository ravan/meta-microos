SUMMARY = "API documentation for osgi-core"
DESCRIPTION = "This package provides API documentation for osgi-core."
LICENSE = "Apache-2.0"

PV = "8.0.0"

RPM_NAME = "osgi-core-javadoc-8.0.0-3.8.noarch.rpm"
RPM_HASH = "abfc8a1bcab375f959da3d0b71f69e628dbff21adca4a10fbc8d808cacf7bb1da3438ae5a0c8b21f573e37e778278b1cb6a9f4001808486d8d2847f3f5e1ee6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osgi-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
