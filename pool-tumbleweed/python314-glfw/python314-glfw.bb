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

RPM_NAME = "python314-glfw-2.10.2-1.1.noarch.rpm"
RPM_HASH = "4cf99a95c3a77f16bee6b25133a310f208fc274ed9da82521c5f1144dc2b671457167bc91bc4f80abba5b852008b9bbe2af6164eb35913dcda1b8baf7811d340"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-glfw \
python314-glfw \
python3dist-glfw"

RDEPENDS:${PN} += "libglfw3 \
python-abi"

inherit rpm
