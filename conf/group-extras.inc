#
# Packages the MicroOS group depends on but does not contain.
#
# scripts/microos links the openSUSE product group, which is a recommends-list
# for the whole product rather than a closed dependency set. Several of its own
# members require packages the list leaves out, and BitBake reports each one as
# "Nothing RPROVIDES" even when the image being built does not use them.
#
# These are not installed in any image. They are linked so that every recipe in
# the layer has a resolvable dependency graph, which keeps a real error from
# being lost among a screenful of harmless ones.
#
# libxml2-16 is required by libxml2-tools, gettext-runtime and shared-mime-info.
# envsubst is required by gettext-runtime.
#

MICROOS_GROUP_EXTRAS = "\
    libxml2-16 \
    envsubst \
"
