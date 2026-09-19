SUMMARY = "Development files for renderdoc"
DESCRIPTION = "RenderDoc is a frame-capture based graphics debugger, currently \
available for Vulkan, D3D11, D3D12, OpenGL, and OpenGL ES development."
LICENSE = "MIT"

PV = "1.44"

RPM_NAME = "renderdoc-devel-1.44-1.3.noarch.rpm"
RPM_HASH = "2d49d65487959af5b1ade9abd09eab25b2b651514dfdfc5fdb0c4bfb1007504eb03ebf6af35406884387926471bf6bb3817f00a3265c3b56edea062e691c4619"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "renderdoc-devel"

RDEPENDS:${PN} += "renderdoc"

inherit rpm
