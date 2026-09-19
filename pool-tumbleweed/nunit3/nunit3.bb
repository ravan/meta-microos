SUMMARY = "Unit-testing framework for all .NET languages"
DESCRIPTION = "NUnit is a unit testing framework for all .NET languages. It serves the \
same purpose as JUnit does in the Java world. It supports test \
categories, testing for exceptions and writing test results in plain \
text or XML."
LICENSE = "MIT"

PV = "3.7.1"

RPM_NAME = "nunit3-3.7.1-1.14.noarch.rpm"
RPM_HASH = "590f503fac1a368c431a8df1daab648f869315b4a36a416f51f0d38b0c62da3526d5f1ef05df7486d5bf969f66946e3a3e2e8b9199f25843af0f9ebc68cf3554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-mock-assembly \
mono-nunit.framework \
mono-nunit.framework.tests \
mono-nunit.testdata \
mono-nunitlite \
mono-nunitlite-runner \
mono-nunitlite.tests \
mono-slow-nunit-tests \
nunit3"

RDEPENDS:${PN} += "/usr/bin/sh \
mono-System \
mono-System.Core \
mono-System.Web \
mono-System.Windows.Forms \
mono-System.Xml \
mono-mscorlib"

inherit rpm
