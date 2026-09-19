SUMMARY = "XSLT Processor Written in Java"
DESCRIPTION = "AdaptX is an extensible stylesheet language (XSL) processor."
LICENSE = "BSD-3-Clause"

PV = "0.9.13"

RPM_NAME = "adaptx-0.9.13-137.10.noarch.rpm"
RPM_HASH = "8f1a5f949628a18efa1494c97f79814adb2e59e443a6f979f2e9bd61f5ec75d0ae99ad15db4ec10d826e6a4b9e247cd2b528ff8960c9da483a370e62235baad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adaptx"

RDEPENDS:${PN} += "reload4j \
xerces-j2 \
xml-apis"

inherit rpm
