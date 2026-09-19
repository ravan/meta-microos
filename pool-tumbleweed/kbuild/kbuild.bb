SUMMARY = "Framework for writing simple makefiles for complex tasks"
DESCRIPTION = "The goals of the kBuild framework: \
 \
* Similar behavior across all supported platforms \
* One configuration file for a subtree automatically included \
* Target configuration templates as the primary mechanism for makefile \
  simplification \
* Tools and SDKs for helping out the templates with flexibility \
* Non-recursive makefile method by using sub-makefiles"
LICENSE = "GPL-2.0-or-later"

PV = "0.1.9998+svn3686"

RPM_NAME = "kbuild-0.1.9998+svn3686-2.3.aarch64.rpm"
RPM_HASH = "8e0fa6c669e79cf17ea77b78ee8d5a0afb228866b55bf76b3da4689190d2d5f25db44d645eb97db5e70295a681ef8edee782f45cbd4b8db54522d474500ef919"

RPROVIDES:${PN} += "kbuild"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
