SUMMARY = "Unit-testing framework for all .NET languages"
DESCRIPTION = "NUnit is a unit testing framework for all .NET languages. It serves the \
same purpose as JUnit does in the Java world. It supports test \
categories, testing for exceptions and writing test results in plain \
text or XML."
LICENSE = "Zlib"

PV = "2.6.4"

RPM_NAME = "nunit-2.6.4-5.14.aarch64.rpm"
RPM_HASH = "16a0d3ea1d09b4f1e07d04179d7ec7af36b7b827302e1e2b83fa64b024306741cc840a29e8e20fef178147ac6e1917686c43f917652f9db41f9e78abeecfd2fd"

RPROVIDES:${PN} += "mono-NSubstitute \
mono-log4net \
mono-mock-assembly \
mono-nonamespace-assembly \
mono-nunit \
mono-nunit-agent \
mono-nunit-console \
mono-nunit-console-runner \
mono-nunit-console.tests \
mono-nunit-editor \
mono-nunit-editor.tests \
mono-nunit-gui-runner \
mono-nunit-gui.tests \
mono-nunit.core \
mono-nunit.core.interfaces \
mono-nunit.core.tests \
mono-nunit.core.tests.45 \
mono-nunit.framework \
mono-nunit.framework.tests \
mono-nunit.framework.tests.net45 \
mono-nunit.mocks \
mono-nunit.mocks.tests \
mono-nunit.uiexception \
mono-nunit.uiexception.tests \
mono-nunit.uikit \
mono-nunit.uikit.tests \
mono-nunit.util \
mono-nunit.util.tests \
mono-pnunit-agent \
mono-pnunit-launcher \
mono-pnunit.framework \
mono-pnunit.tests \
mono-test-assembly \
mono-test-assembly-net45 \
mono-test-utilities \
nunit"

RDEPENDS:${PN} += "/usr/bin/sh \
mono-System \
mono-System.Configuration \
mono-System.Data \
mono-System.Drawing \
mono-System.Runtime.Remoting \
mono-System.Web \
mono-System.Windows.Forms \
mono-System.Xml \
mono-mscorlib"

inherit rpm
