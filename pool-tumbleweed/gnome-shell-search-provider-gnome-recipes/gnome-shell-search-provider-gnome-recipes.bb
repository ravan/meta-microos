SUMMARY = "A recipe app for GNOME -- Search Provider for GNOME Shell"
DESCRIPTION = "GNOME Recipes is an easy-to-use application that will help you to discover what to cook \
today, tomorrow, rest of the week and for your special occasions. \
 \
Recipes comes with a collection of recipes that have been collected by GNOME contributors \
from all over the world. It also lets you store your own recipes, and share them with your \
friends. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from Recipes."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.4+117"

RPM_NAME = "gnome-shell-search-provider-gnome-recipes-2.0.4+117-3.6.aarch64.rpm"
RPM_HASH = "db3c87b5217f75a663fa4ea7f4ed65cee62cebdb86222954f0359a976b0f41ebee902f366a0df47e8d0b41483d9018a368d985744921464663ef3cdbbd00e344"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-recipes"

RDEPENDS:${PN} += "gnome-recipes \
gnome-shell"

inherit rpm
