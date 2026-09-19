SUMMARY = "Ant for .NET"
DESCRIPTION = "NAnt is a free .NET build tool. In theory it is kind of like make \
without make's wrinkles. In practice it's a lot like Ant."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "0.92+git20130131"

RPM_NAME = "nant-0.92+git20130131-11.6.noarch.rpm"
RPM_HASH = "f38c69096400ff16f17eb71bd1a6307a588b3414db2309dd5002dc36c187922cb320cfc4a291747eaf84276150672c4ff37c71990714a38a0cfe38d56b3731c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-NAnt \
mono-NAnt.CompressionTasks \
mono-NAnt.Core \
mono-NAnt.DotNetTasks \
mono-NAnt.MSBuild \
mono-NAnt.NUnit \
mono-NAnt.NUnit1Tasks \
mono-NAnt.NUnit2Tasks \
mono-NAnt.SourceControlTasks \
mono-NAnt.VSNetTasks \
mono-NAnt.VisualCppTasks \
mono-NAnt.Win32Tasks \
nant"

RDEPENDS:${PN} += "mono-System \
mono-System.Configuration \
mono-System.Data \
mono-System.Drawing \
mono-System.Runtime.Remoting \
mono-System.Web \
mono-System.Windows.Forms \
mono-System.Xml \
mono-mscorlib"

inherit rpm
