SUMMARY = "A ctypes-based wrapper for GLFW3"
DESCRIPTION = "This module provides Python bindings for GLFW . It is a \
ctypes wrapper which keeps very close to the original GLFW API, \
except for: \
 \
-  function names use the pythonic ``words_with_underscores`` notation \
   instead of ``camelCase`` \
-  ``GLFW_`` and ``glfw`` prefixes have been removed, as their function \
   is replaced by the module namespace \
-  structs have been replaced with Python sequences \
-  functions like ``glfwGetMonitors`` return a list instead of a pointer \
   and an object count \
-  Gamma ramps use floats between 0.0 and 1.0 instead of unsigned shorts \
-  GLFW errors are reported as ``glfw.GLFWError`` exceptions if no error \
   callback is set (use ``glfw.ERROR_REPORTING=False`` to disable this)"
LICENSE = "MIT"

PV = "2.10.2"

RPM_NAME = "python313-glfw-2.10.2-1.1.noarch.rpm"
RPM_HASH = "ad526d984831089b09106a25f5f2c55045695b4279dc5911638ae07a926dd0f890f31df34844cba84d0c9c3bb24fb60ef906a6a8f0d16215620dea7f03108853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-glfw \
python3.13dist-glfw \
python313-glfw \
python3dist-glfw"

RDEPENDS:${PN} += "libglfw3 \
python-abi"

inherit rpm
