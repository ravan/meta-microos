SUMMARY = "Fish completion for fzf"
DESCRIPTION = "fish shell completions for fzf \
 \
To enable it, ensure you have a file ~/.config/fish/functions/fish_user_key_bindings.fish \
which contains: \
function fish_user_key_bindings \
	fzf_key_bindings \
end \
 \
(or append fzf_key_bindings to the fish_user_key_bindings function if the file already exists)"
LICENSE = "MIT"

PV = "0.74.3"

RPM_NAME = "fzf-fish-integration-0.74.3-1.1.noarch.rpm"
RPM_HASH = "095c56d387b0a2563624c206968853513702241a413abb0ac61dd97999353d7c1e585b35fc9d50fec36b23a154543fe7ae160952808cfb525daccd3d9f7352a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fzf-fish-completion \
fzf-fish-integration"

RDEPENDS:${PN} += "fish \
fzf"

inherit rpm
