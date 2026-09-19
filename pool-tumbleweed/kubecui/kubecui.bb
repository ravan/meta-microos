SUMMARY = "Simple but still extremely powerful K9S alternative"
DESCRIPTION = "kubeui makes kubectl more user friendly. This is still kubectl but enhanced \
with fzf. \
 \
I believe, anybody who is new to kubernetes, must use kubectl. Because kubectl \
is the basics. \
 \
However, kubectl slows you down - requires heavy keyboard typing. In order to \
alleviate interaction with kubernetes API and describe the fields associated \
with each supported API resource directly in the Terminal, kubectl was \
complemented by fzf."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "kubecui-1.0.3-1.4.noarch.rpm"
RPM_HASH = "df4761aef0ad89a3af39f7990e0c6208e2ff85a9e42a23776795a27db8ba1a8b77fe9a4d0b7832698db26d8354a55e5dc60ff8ce270912eccb943384b7c51853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubecui"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
fzf \
jq"

inherit rpm
