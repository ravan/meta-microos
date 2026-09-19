SUMMARY = "Mono's Visual Basic Compiler and Runtime"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Mono's VB runtime."
LICENSE = "LGPL-2.1"

PV = "4.7"

RPM_NAME = "mono-basic-4.7-3.6.noarch.rpm"
RPM_HASH = "e24d7023eff2461a00c49b4e93b4291e2d2f1465663abf779ce8da76a7a940136a38fd8439b3b65c1ae8c6a6e25e9418d8219b433e1e1edc2673050f9ea11e56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-Microsoft.VisualBasic \
mono-Mono.Cecil.VB \
mono-Mono.Cecil.VB.Mdb \
mono-Mono.Cecil.VB.Pdb \
mono-basic \
mono-vbnc"

RDEPENDS:${PN} += "/usr/bin/sh \
mono-System \
mono-System.Core \
mono-System.Drawing \
mono-System.Windows.Forms \
mono-mscorlib"

inherit rpm
