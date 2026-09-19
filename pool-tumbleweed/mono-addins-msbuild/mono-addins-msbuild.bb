SUMMARY = "Mono Addins Framework, MSBuild Support"
DESCRIPTION = "Mono.Addins is a generic framework for creating extensible \
applications, and for creating libraries which extend those \
applications. \
 \
This package contains MSBuild tasks file and target, which allows \
using add-in references directly in a build file (still experimental)."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "mono-addins-msbuild-1.3.3-3.16.noarch.rpm"
RPM_HASH = "af9a82c32291cc73f4772b66c2d9072cd616ddd2568f281c82b39c643d0e9ae828bc73efc03b692175dcf40441ed37a6c0edfa3069eb718929a41297c0a7af10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-Mono.Addins.MSBuild \
mono-addins-msbuild \
mono-policy.0.2.Mono.Addins.MSBuild \
mono-policy.0.3.Mono.Addins.MSBuild \
mono-policy.0.4.Mono.Addins.MSBuild \
mono-policy.0.5.Mono.Addins.MSBuild \
mono-policy.0.6.Mono.Addins.MSBuild"

RDEPENDS:${PN} += "mono-Microsoft.Build.Framework \
mono-Microsoft.Build.Utilities.v4.0 \
mono-Mono.Addins \
mono-Mono.Addins.Setup \
mono-System \
mono-addins \
mono-mscorlib"

inherit rpm
